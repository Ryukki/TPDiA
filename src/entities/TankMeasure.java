package entities;


import java.util.Date;

/**
 * Created by Ryukki on 03.07.2018.
 */
public class TankMeasure {
    private Date measureDate;
    private Integer locationId;//always empty
    private Integer meterId;//always empty
    private Integer tankId;
    private Integer fuelHeight;//always zero
    private Double fuelVolume;
    private Integer fuelTemperature;
    private Integer waterHeight;//always empty
    private Integer waterVolume;//always empty

    public void setMeasureDate(Date measureDate) {
        this.measureDate = measureDate;
    }

    public void setLocationId(Integer locationId) {
        this.locationId = locationId;
    }

    public void setMeterId(Integer meterId) {
        this.meterId = meterId;
    }

    public void setTankId(Integer tankId) {
        this.tankId = tankId;
    }

    public void setFuelHeight(Integer fuelHeight) {
        this.fuelHeight = fuelHeight;
    }

    public void setFuelVolume(Double fuelVolume) {
        this.fuelVolume = fuelVolume;
    }

    public void setFuelTemperature(Integer fuelTemperature) {
        this.fuelTemperature = fuelTemperature;
    }

    public void setWaterHeight(Integer waterHeight) {
        this.waterHeight = waterHeight;
    }

    public void setWaterVolume(Integer waterVolume) {
        this.waterVolume = waterVolume;
    }

    public TankMeasure() {
        locationId = 0;
        meterId = 0;
        fuelHeight = 0;
        waterHeight = 0;
        waterVolume = 0;
    }
}
