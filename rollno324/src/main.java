import java.io.File;

public class RenameRepository {
    public static void main(String[] args) {
        File oldFolder = new File("D:\\java_code\\project111");
        File newFolder = new File("D:\\java_code\\OTBookingSystem");

        if (oldFolder.exists()) {
            if (oldFolder.renameTo(newFolder)) {
                System.out.println("Repository folder renamed successfully!");
            } else {
                System.out.println("Failed to rename repository folder.");
            }
        } else {
            System.out.println("Original folder does not exist.");
        }
    }
}