(ns recursion.core
  (:gen-class))

(defn add [x y]
  (println (str "x is " x))
  (cond
    (= x y) x
    :else (recur (inc x) y)))

(defn -main [& args]
  (add 1 10000))
