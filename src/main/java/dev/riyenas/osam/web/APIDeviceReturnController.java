package dev.riyenas.osam.web;

import dev.riyenas.osam.service.DeviceService;
import dev.riyenas.osam.service.RuleService;
import dev.riyenas.osam.service.SoldierService;
import dev.riyenas.osam.web.dto.app.SoldierSignUpRequestDto;
import dev.riyenas.osam.web.dto.app.SoldierSignUpResponseDto;
import dev.riyenas.osam.web.dto.device.DeviceLogResponseDto;
import dev.riyenas.osam.web.dto.soldier.SoldierDeviceResponseDto;
import lombok.RequiredArgsConstructor;
import lombok.extern.log4j.Log4j2;
import org.springframework.web.bind.annotation.*;

import java.text.ParseException;
import java.util.List;

@Log4j2
@RequiredArgsConstructor
@RestController
@RequestMapping("/api/soldier/")
public class APIDeviceReturnController {

    private final SoldierService soldierService;
    private final RuleService ruleService;
    private final DeviceService deviceService;

    @PostMapping("create")
    public SoldierSignUpResponseDto create(@RequestBody SoldierSignUpRequestDto soldierSignUpRequestDto) {
        return soldierService.createSoldier(soldierSignUpRequestDto);
    }

    @GetMapping("find/all")
    public List<SoldierDeviceResponseDto> findAll() {
        return soldierService.findAllDesc();
    }

    @GetMapping("find/admin/serviceNumber/{adminServiceNumber}")
    public List<SoldierDeviceResponseDto> findByAdminServiceNumber(@PathVariable String adminServiceNumber) {
        log.info(adminServiceNumber);
        return soldierService.findByAdminServiceNumber(adminServiceNumber);
    }

    @GetMapping("find/admin/signUpCode/{signUpCode}")
    public List<SoldierDeviceResponseDto> findBySignUpCode(@PathVariable String signUpCode) {
        return soldierService.findBySignUpCode(signUpCode);
    }

    @GetMapping("return/time/valid")
    public boolean isValidUseTime(@RequestParam Long millis, @RequestParam Long adminId) throws ParseException {
        return ruleService.isValidUsingTime(millis, adminId);
    }

    @GetMapping("return/status/admin/{adminId}")
    public List<DeviceLogResponseDto> statistic(@PathVariable Long adminId) {
        return deviceService.returnStatus(adminId);
    }

    @GetMapping("return/status")
    public List<DeviceLogResponseDto> statistic() {
        return deviceService.returnStatusAll();
    }
}
