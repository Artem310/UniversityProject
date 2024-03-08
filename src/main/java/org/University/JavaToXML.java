package org.University;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Marshaller;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.StringWriter;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.List;

public class JavaToXML {
    public static void javaToXML(List<Student> students, List<University> universities, List<Statistics> statistics) {


        File directory = new File("src/main/resources/XMLreqs/");
        if(!directory.exists()) {
            directory.mkdirs();
        }

        LocalDateTime localDateTime = LocalDateTime.now();
        String formattedDateTime = localDateTime.format(DateTimeFormatter.ofPattern("yyyy-MM-dd_HH-mm-ss_"));

        File file = new File("src/main/resources/XMLreqs/" + formattedDateTime + "req.xml");
        StringWriter stringWriter = new StringWriter();
        ListWrapper listWrapper = new ListWrapper();


        try(FileWriter fileWriter = new FileWriter(file)) {
            JAXBContext context = JAXBContext.newInstance(Student.class, ListWrapper.class, University.class);
            Marshaller marshaller = context.createMarshaller();
            marshaller.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT, true);
            listWrapper.setStudentList(students);
            listWrapper.setUniversityList(universities);
            listWrapper.setStatisticsList(statistics);

            marshaller.marshal(listWrapper, stringWriter);

            fileWriter.write(stringWriter.toString());

        } catch (JAXBException | IOException e) {
            e.printStackTrace();
        }

    }
}
