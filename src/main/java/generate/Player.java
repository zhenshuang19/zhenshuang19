package generate;

import java.io.Serializable;

/**
 * player
 * @author 
 */
public class Player implements Serializable {
    /**
     * 球员编号
     */
    private Integer playerId;

    /**
     * 球员姓名
     */
    private String playerName;

    /**
     * 照片
     */
    private String playerPicture;

    /**
     * 身高
     */
    private Integer playerHeight;

    /**
     * 体重
     */
    private Integer playerWeight;

    /**
     * 经历
     */
    private String playerExperience;

    /**
     * 职务
     */
    private String playerPosition;

    /**
     * 球队编号
     */
    private Integer teamId;

    private static final long serialVersionUID = 1L;

    public Integer getPlayerId() {
        return playerId;
    }

    public void setPlayerId(Integer playerId) {
        this.playerId = playerId;
    }

    public String getPlayerName() {
        return playerName;
    }

    public void setPlayerName(String playerName) {
        this.playerName = playerName;
    }

    public String getPlayerPicture() {
        return playerPicture;
    }

    public void setPlayerPicture(String playerPicture) {
        this.playerPicture = playerPicture;
    }

    public Integer getPlayerHeight() {
        return playerHeight;
    }

    public void setPlayerHeight(Integer playerHeight) {
        this.playerHeight = playerHeight;
    }

    public Integer getPlayerWeight() {
        return playerWeight;
    }

    public void setPlayerWeight(Integer playerWeight) {
        this.playerWeight = playerWeight;
    }

    public String getPlayerExperience() {
        return playerExperience;
    }

    public void setPlayerExperience(String playerExperience) {
        this.playerExperience = playerExperience;
    }

    public String getPlayerPosition() {
        return playerPosition;
    }

    public void setPlayerPosition(String playerPosition) {
        this.playerPosition = playerPosition;
    }

    public Integer getTeamId() {
        return teamId;
    }

    public void setTeamId(Integer teamId) {
        this.teamId = teamId;
    }
}