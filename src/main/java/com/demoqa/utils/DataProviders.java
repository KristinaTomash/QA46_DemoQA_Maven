package com.demoqa.utils;

public class DataProviders {
}
@DataProvider
public Iterator<Object[]> addNewStudentFormWithCsv() throws IOException {
    List<Object[]> list=new ArrayList<>();
    BufferedReader reader = new BufferedReader(new FileReader(new File("src/test/resources/student.csv")));

    String line = reader.readLine();

    while (line!=null)
    {
        list.add(line.split(","));
        line=reader.readLine();
    }

    return list.iterator();
}
