package lk.cloudcomputingcw.coursework.main;

import java.util.List;
import java.util.Map;

public class OutputRequest {

    private String orbitName;

    private List<Map<String, Object>> ret;

    private String result;

    public String getOrbitName() {
        return orbitName;
    }

    public void setOrbitName(String orbitName) {
        this.orbitName = orbitName;
    }

    public List<Map<String, Object>> getRet() {
        return ret;
    }

    public void setRet(List<Map<String, Object>> ret) {
        this.ret = ret;
    }

    public String getResult() {
        return result;
    }

    public void setResult(String result) {
        this.result = result;
    }

    @Override
    public String toString() {
        return "OutputRequest{" +
                "orbitName='" + orbitName + '\'' +
                ", ret=" + ret +
                ", result='" + result + '\'' +
                '}';
    }
}
