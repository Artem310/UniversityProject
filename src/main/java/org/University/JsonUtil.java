package org.University;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.reflect.TypeToken;

import java.util.List;

public class JsonUtil {

    public static String serializationStudent(Student student) {
        Gson gson = new GsonBuilder().setPrettyPrinting().create();
        return gson.toJson(student);
    }
    public static String serializationUniversity(University university) {
        Gson gson = new GsonBuilder().setPrettyPrinting().create();
        return gson.toJson(university);
    }
    public static String serializationStudents(List<Student> students) {
        Gson gson = new GsonBuilder().setPrettyPrinting().create();
        return gson.toJson(students);
    }
    public static String serializationUniversities(List<University> universities) {
        Gson gson = new GsonBuilder().setPrettyPrinting().create();
        return gson.toJson(universities);
    }
    public static Student deserializationStudent(String json) {
        return new Gson().fromJson(json, Student.class);
    }
    public static University deserializationUniversity(String json) {
        return new Gson().fromJson(json, University.class);
    }
    public static List<Student> deserializationStudents(String students) {
        return new Gson().fromJson(students, new TypeToken<List<Student>>(){}.getType());
    }
    public static List<University> deserializationUniversities(String universities) {
        return new Gson().fromJson(universities, new TypeToken<List<University>>(){}.getType());
    }

    private JsonUtil(){};
}
