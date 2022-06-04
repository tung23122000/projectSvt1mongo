package dts.com.digital.service.impl;

import dts.com.digital.Repository.PositionRespository;
import dts.com.digital.entity.Position;
import dts.com.digital.service.PositionService;

import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PositionServiceImpl implements PositionService {
    private final PositionRespository positionRespository;

    public PositionServiceImpl(
            PositionRespository positionRespository) {this.positionRespository = positionRespository;}

    @Override
    public List<Position> fillAllPo() {
        return positionRespository.findAll();
    }

    @Override
    public Position getOnePo(String id) {
        List<Position> list = positionRespository.findAll();
        Position position = new Position();
        for (Position pos : list) {
            if (pos.get_id().equals(id)) {
                position = pos;
                break;
            }
        }
        return position;
    }

    @Override
    public void deleteAllPo() {
        positionRespository.deleteAll();
    }

    @Override
    public void deleteOnePo(String id) {
        List<Position> list = positionRespository.findAll();
        for (Position pos : list) {
            if (pos.get_id().equals(id)) {
                positionRespository.delete(pos);
                break;
            }
        }
    }

    @Override
    public void createpo(Position position) {
    positionRespository.save(position);
    }

    @Override
    public void editPo(String id, Position position) {
        List<Position> list = positionRespository.findAll();

        for (Position pos : list) {
            if (pos.get_id().equals(id)) {
                positionRespository.delete(pos);
               positionRespository.save(position);
            }
        }
    }
}
