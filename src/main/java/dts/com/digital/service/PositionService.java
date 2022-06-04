package dts.com.digital.service;

import dts.com.digital.entity.Position;

import java.util.List;

public interface PositionService {
    List<Position> fillAllPo();
    Position getOnePo(String id);
    void deleteAllPo();
    void deleteOnePo(String id);
    void createpo(Position position);
    void editPo(String id,Position position);
}
