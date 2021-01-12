package lk.cloudcomputingcw.coursework.main;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Map;

@Service
public class MainService {

    @Autowired
    private MainRepo mainRepo;

    public String getOrbitName(String id) {
        return mainRepo.getOrbitName(id);
    }

    public List<Map<String, Object>> getSatteliteInfo(InpurRequest inpurRequest) {
        return mainRepo.getSatteliteInfo(inpurRequest);
    }

    public List<Map<String, Object>> getOrbitInfo(InpurRequest inpurRequest) {
        return  mainRepo.getOrbitInfo();
    }

    public List<Map<String, Object>> getConstellationInfo(InpurRequest inpurRequest) {
        return mainRepo.getConstellationInfo();
    }

    public boolean auth(InpurRequest inpurRequest) {
        return mainRepo.auth(inpurRequest);
    }
}
