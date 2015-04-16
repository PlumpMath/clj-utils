(ns clj-utils.core-test
  (:require [clojure.test :refer :all]
            [clj-utils.core :refer :all]))

(deftest test-valmap
  (testing "basic functionality"
    (is (= {1 2 2 3 3 4} (valmap inc {1 1 2 2 3 3})))))

(deftest test-keymap
  (testing "maps keys of a map returning a new map")
    (is (= {2 1 3 2 4 3} (keymap inc {1 1 2 2 3 3}))))

(deftest test-indexed
  (testing "returns an indexed version of the given sequence"
    (is (= [[0 :a] [1 :b] [2 :c]]) (indexed [:a :b :c])))
  (testing "infinite sequences")
    (is (= [[0 :a] [1 :a] [2 :a]] (take 3 (indexed (repeat :a))))))
