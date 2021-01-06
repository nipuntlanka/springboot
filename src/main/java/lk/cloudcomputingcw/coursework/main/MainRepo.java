package lk.cloudcomputingcw.coursework.main;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Map;

@Repository
public class MainRepo {
    @Qualifier("jdbcUserService")
    @Autowired
    JdbcTemplate jdbcTemplate;


    public String getOrbitName(String id) {
        List<Map<String, Object>> response = null;
        try {


            List<Map<String, Object>> queryForList = jdbcTemplate.queryForList(
                    "select * from starlink.Orbits where orbit_id='"+id+"'");

            response = queryForList;
        } catch (Exception ex) {

            ex.printStackTrace();
        }
        System.out.println(response.get(0).get("orbit_name").toString());
        return response.get(0).get("orbit_name").toString();
    }

    public List<Map<String, Object>> getSatteliteInfo(InpurRequest inpurRequest) {
        List<Map<String, Object>> response = null;
        try {


            List<Map<String, Object>> queryForList = jdbcTemplate.queryForList(
                    "SELECT * FROM starlink.Satellite");

            response = queryForList;
        } catch (Exception ex) {

            ex.printStackTrace();
        }
        return response;
    }

    public List<Map<String, Object>> getOrbitInfo() {
        List<Map<String, Object>> response = null;
        try {


            List<Map<String, Object>> queryForList = jdbcTemplate.queryForList(
                    "SELECT * FROM starlink.Orbits");

            response = queryForList;
        } catch (Exception ex) {

            ex.printStackTrace();
        }
        return response;
    }

    public List<Map<String, Object>> getConstellationInfo() {
        List<Map<String, Object>> response = null;
        try {


            List<Map<String, Object>> queryForList = jdbcTemplate.queryForList(
                    "SELECT * FROM starlink.Constellations");

            response = queryForList;
        } catch (Exception ex) {

            ex.printStackTrace();
        }
        return response;
    }
}
