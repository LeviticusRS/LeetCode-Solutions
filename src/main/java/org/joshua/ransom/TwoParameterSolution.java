package org.joshua.ransom;

public interface TwoParameterSolution<T, U, V> extends Solution<T, U> {
    T bruteForce(U input, V target);
}