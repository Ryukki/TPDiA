import entities.NozzleMeasure;
import entities.Refuel;
import entities.TankMeasure;
import utils.TxtFileParser;

import java.util.List;

/**
 * Created by Ryukki on 03.07.2018.
 */
public class Main {
    public static void main(String[] args){
        TxtFileParser txtFileParser = new TxtFileParser();
        //List<TankMeasure> tempList = txtFileParser.readTankMeasures("DanePaliwowe//Zestaw1//tankMeasures.log");
        //List<NozzleMeasure> tempList = txtFileParser.readNozzleMeasures("DanePaliwowe//Zestaw1//nozzleMeasures.log");
        List<Refuel> tempList = txtFileParser.readRefuel("DanePaliwowe//Zestaw1//refuel.log");
        System.out.println();
    }
}
