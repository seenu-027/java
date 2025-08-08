package day4;
import java.io.File;
import java.util.Date;
public class readfile {
	public static void main(String a[]) {
        File file = new File("D:\\python foundation course");
        String[] fileList = file.list();
        for (String name : fileList) {
            System.out.println(name);
        }
	}
}

