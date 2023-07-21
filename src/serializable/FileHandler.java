package serializable;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutput;
import java.io.ObjectOutputStream;
import java.io.Serial;
import java.io.Serializable;

public class FileHandler implements Writable {
    @Override
    public boolean save(Serializable serializable, String filePath){
        try (ObjectOutputStream objectOutputStream = new ObjectOutputStream(new FileOutputStream(filePath))){
            objectOutputStream.writeObject(serializable);
            return true;
        } catch (Exception e){
            e.printStackTrace();
            return false;
        }
    }
    @Override
    public Object read(String filePath){
        try (ObjectInputStream objectOutputStream = new ObjectOutputStream(new FileInputStream(filePath))){
            return objectOutputStream.readObject();
        } catch (Exception e){
            e.printStackTrace();
            return null;
        }
    }
}
