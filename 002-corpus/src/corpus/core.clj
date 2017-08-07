(ns corpus.core
  (:gen-class)
  (:require [clojure.java.io :as io]
            [clojure.string :as string]))

(defn file->words [file]
  (->>
    (str file)
    (slurp)
    (re-seq #"\w+")
    (map string/lower-case)))

(defn word-count-reduce [words]
  (reduce #(assoc %1 %2 (inc (%1 %2 0)))
          {}
          words))

(defn word-count-sort [words]
  (as->
    words x
    (frequencies x)
    (sort-by first x)
    (sort-by val > x)))

(defn -main [& args]
  (as->
    (first args) x
    (file->words x)
    (word-count-sort x)
    (map #(str (second %) " " (first %)) x)
    (string/join \newline x)
    (println x)))
