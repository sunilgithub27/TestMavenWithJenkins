package utilities;

import org.json.simple.JSONArray;
import org.testng.annotations.Test;
import org.json.simple.JSONObject;

public class WriteJson {

    @Test
    public void createJsonFile(){
        JSONObject student1 = new JSONObject();
        student1.put("studentName", "John");
        student1.put("Grade", "5th");
        student1.put("Location", "16 park street");

        JSONObject student2 = new JSONObject();
        student2.put("studentName", "Anna");
        student2.put("Grade", "7th");
        student2.put("Location", "23,La street");

        System.out.println(student1.toJSONString());
        System.out.println(student2.toJSONString());

        JSONArray studentsDetails = new JSONArray();
        studentsDetails.add(student1);
        studentsDetails.add(student2);

        System.out.println(studentsDetails.toJSONString());

        JSONObject students = new JSONObject();
        students.put("students", studentsDetails);
        System.out.println(students.toJSONString());
    }
}
