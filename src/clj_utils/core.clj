(ns clj-utils.core)

(defn valmap [f m]
  (into {} (for [[k v] m] [k (f v)])))

(defn keymap [f m]
  (into {} (for [[k v] m] [(f k) v])))

