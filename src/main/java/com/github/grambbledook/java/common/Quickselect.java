package com.github.grambbledook.java.common;

import com.github.grambbledook.java.common.Swap;

import java.util.Random;

public interface Quickselect extends Swap {

    Random rnd = new Random();

    int select(int[] nums, int k);
}
