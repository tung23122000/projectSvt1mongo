package dts.com.digital.service.impl;


import dts.com.digital.Repository.LeaveInformationRespository;
import dts.com.digital.entity.LeaveInformation;
import dts.com.digital.service.LeaveInformationService;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class LeaveInformationServiceImpl implements LeaveInformationService {
    private final LeaveInformationRespository leaveInformationRespository;

    public LeaveInformationServiceImpl(
            LeaveInformationRespository leaveInformationRespository) {this.leaveInformationRespository = leaveInformationRespository;}

    @Override
    public List<LeaveInformation> fillAllLe() {
        return leaveInformationRespository.findAll();
    }

    @Override
    public LeaveInformation getOneLe(String code) {
        List<LeaveInformation> list = leaveInformationRespository.findAll();
        LeaveInformation leaveInformation = new LeaveInformation();
        for (LeaveInformation lea : list) {
            if (lea.getCode().equals(code)) {
                leaveInformation = lea;
                break;
            }
        }
        return leaveInformation;
    }

    @Override
    public void deleteAllLe() {
        leaveInformationRespository.deleteAll();
    }

    @Override
    public void deleteOneLe(String code) {
        List<LeaveInformation> list = leaveInformationRespository.findAll();
        LeaveInformation leaveInformation = new LeaveInformation();
        for (LeaveInformation lea : list) {
            if (lea.getCode().equals(code)) {
                leaveInformationRespository.delete(lea);
                break;
            }
        }
    }

    @Override
    public void createLe(LeaveInformation leaveInformation) {
        leaveInformationRespository.save(leaveInformation);
    }

    @Override
    public void editLe(String code, LeaveInformation leaveInformation) {
        List<LeaveInformation> list = leaveInformationRespository.findAll();
        for (LeaveInformation lea : list) {
            if (lea.getCode().equals(code)) {
                leaveInformationRespository.delete(lea);
                leaveInformationRespository.save(leaveInformation);
                break;
            }
        }
    }
}
