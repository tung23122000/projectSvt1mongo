package dts.com.digital.service;


import dts.com.digital.entity.LeaveInformation;

import java.util.List;

public interface LeaveInformationService {
    List<LeaveInformation> fillAllLe();
    LeaveInformation getOneLe(String code);
    void deleteAllLe();
    void deleteOneLe(String code);
    void createLe(LeaveInformation leaveInformation);
    void editLe(String code,LeaveInformation leaveInformation);
}
