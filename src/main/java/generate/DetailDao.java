package generate;

import org.springframework.stereotype.Repository;

import javax.xml.soap.Detail;

/**
 * DetailDao继承基类
 */
@Repository
public interface DetailDao extends MyBatisBaseDao<Detail, Integer> {
}
