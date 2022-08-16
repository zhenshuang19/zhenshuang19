package generate;

import generate.Player;

public interface PlayerDao {
    int deleteByPrimaryKey(Integer playerId);

    int insert(Player record);

    int insertSelective(Player record);

    Player selectByPrimaryKey(Integer playerId);

    int updateByPrimaryKeySelective(Player record);

    int updateByPrimaryKey(Player record);
}