package np.com.pantbinod.locationweb.util;

import org.springframework.stereotype.Service;

import java.util.List;
public interface ReportUtil {

    void generatePieChart(String path, List<Object[]> data);
}
