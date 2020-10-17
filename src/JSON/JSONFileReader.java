package JSON;

import com.google.gson.Gson;
import main.Project;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.Reader;

public class JSONFileReader
{

  public static Project read(int projectNumber, String filePath)
  {
    Gson gson = new Gson();

    try
    {
      Reader reader = new FileReader(filePath + projectNumber + ".json");
      return gson.fromJson(reader, Project.class);
    }
    catch (FileNotFoundException e)
    {
      return null;
    }

  }

}
