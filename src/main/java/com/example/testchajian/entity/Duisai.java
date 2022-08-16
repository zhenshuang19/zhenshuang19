package com.example.testchajian.entity;

import java.io.Serializable;

/**
 * duisai
 * @author
 */
public class Duisai extends DuisaiKey implements Serializable {
    /**
     * 赛1
     */
    private Integer roundOne;

    /**
     * 赛2
     */
    private Integer roundTwo;

    /**
     * 赛3
     */
    private Integer roundThree;

    /**
     * 赛4
     */
    private Integer roundFour;

    /**
     * 加时赛
     */
    private Integer jiashi;

    /**
     * 总分
     */
    private Integer sumFen;

    private static final long serialVersionUID = 1L;
}
