package by.uladzimirmakei.taskone.action.impl;

import by.uladzimirmakei.taskone.action.SearchAction;
import by.uladzimirmakei.taskone.entity.CostumerArray;

import java.util.Arrays;
import java.util.OptionalDouble;
import java.util.OptionalInt;

import static by.uladzimirmakei.taskone.util.ArrayUtil.isCostumerArrayValid;

public class SearchActionImpl implements SearchAction<CostumerArray> {

    @Override
    public OptionalDouble searchAverageValue(CostumerArray input) {
        OptionalDouble result = OptionalDouble.empty();
        if (isCostumerArrayValid(input)) {
            result = Arrays.stream(input.getArray()).average();
        }
        return result;
    }

    public OptionalInt searchMaxValue(CostumerArray input) {
        OptionalInt result = OptionalInt.empty();
        if (isCostumerArrayValid(input)) {
            result = Arrays.stream(input.getArray()).max();
        }
        return result;
    }

    public OptionalInt searchMinValue(CostumerArray input) {
        OptionalInt result = OptionalInt.empty();
        if (isCostumerArrayValid(input)) {
            result = Arrays.stream(input.getArray()).min();
        }
        return result;
    }
}