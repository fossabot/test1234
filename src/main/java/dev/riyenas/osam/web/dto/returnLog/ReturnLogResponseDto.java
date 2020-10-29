package dev.riyenas.osam.web.dto.returnLog;

import com.fasterxml.jackson.annotation.JsonFormat;
import dev.riyenas.osam.domain.device.Device;
import dev.riyenas.osam.domain.log.ReturnLog;
import dev.riyenas.osam.domain.soldier.Soldier;
import lombok.Getter;
import lombok.ToString;

import java.util.Date;

@Getter
@ToString
public class ReturnLogResponseDto {
    private Long id;
    private String serviceNumber;
    private String name;
    private Double weight;
    private String state;
    private String guid;
    private String type;
    private String manufacturer;

    @JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "yyyy-MM-dd HH:mm:ss", timezone = "Asia/Seoul")
    private Date returnTime;

    public ReturnLogResponseDto(ReturnLog returnLog) {
        Soldier soldier = returnLog.getDevice().getSoldier();
        Device device = returnLog.getDevice();

        this.serviceNumber = soldier.getServiceNumber();
        this.name = soldier.getName();
        this.id = returnLog.getId();
        this.returnTime = returnLog.getReturnTime();
        this.weight = returnLog.getWeight();
        this.state = returnLog.getState().toString();
        this.guid = device.getGuid();
        this.type = device.getType();
        this.manufacturer = device.getManufacturer();
    }
}
