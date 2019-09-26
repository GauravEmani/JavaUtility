import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

import org.json.JSONException;
import org.json.JSONObject;
import org.json.XML;

public class XmlToJson {

    public static int PRETTY_PRINT_INDENT_FACTOR = 4;
    public static String TEST_XML_STRING =
        "<?xml version=\"1.0\" ?><test attrib=\"moretest\">Turn this to JSON</test>";

    public static void main(String[] args) {
        try {
    /*        File f = new File("input1.json");
            FileWriter fw = null;
            try {
				fw = new FileWriter(f);
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}*/
            JSONObject xmlJSONObj = XML.toJSONObject(TEST_XML_STRING);
            //xmlJSONObj.write(fw);
            String jsonPrettyPrintString = xmlJSONObj.toString(PRETTY_PRINT_INDENT_FACTOR);

            //Write JSON file
            try (FileWriter file = new FileWriter("input1.json")) {
     
                file.write(jsonPrettyPrintString);
                file.flush();
     
            } catch (IOException e) {
                e.printStackTrace();
            }
           // System.out.println(jsonPrettyPrintString);
        } catch (JSONException je) {
            System.out.println(je.toString());
        }
    }
}