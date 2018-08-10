package entities;

import java.util.Date;

/**
 * Created by Ryukki on 03.07.2018.
 */
public class NozzleMeasure {
    private Date measureDate;
    private Integer locationId = 0;//always empty
    private Integer pistolId;
    private Integer tankId;
    private Double literCounter;//current transaction counter
    private Double totalCounter;//total counter of the pistol(nozzle)
    private Boolean status;//1-put down, 0-fueling in process

    public void setMeasureDate(Date measureDate) {
        this.measureDate = measureDate;
    }

    public void setLocationId(Integer locationId) {
        this.locationId = locationId;
    }

    public void setPistolId(Integer pistolId) {
        this.pistolId = pistolId;
    }

    public void setTankId(Integer tankId) {
        this.tankId = tankId;
    }

    public void setLiterCounter(Double literCounter) {
        this.literCounter = literCounter;
    }

    public void setTotalCounter(Double totalCounter) {
        this.totalCounter = totalCounter;
    }

    public void setStatus(Boolean status) {
        this.status = status;
    }
}
