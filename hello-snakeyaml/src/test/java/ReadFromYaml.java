import org.junit.Test;
import org.yaml.snakeyaml.Yaml;

import java.io.InputStream;
import java.util.Map;

public class ReadFromYaml {
    @Test
    public void readFromYaml(){
        InputStream inputStream = null;
        try{
            inputStream = this.getClass().getClassLoader().getResourceAsStream("test.yml");
        } catch (Exception e){
            e.printStackTrace();
        }

        Yaml yaml = new Yaml();
        Map<String,Object> rootYml = yaml.load(inputStream);
        String name = (String) rootYml.get("name");
        System.out.println(name);

        Map<String,String> otherYml = (Map<String,String>) rootYml.get("other");
        for(Map.Entry<String,String> entry:otherYml.entrySet()){
            System.out.printf("%s : %s \n",entry.getKey(),entry.getValue());
        }
    }
}
