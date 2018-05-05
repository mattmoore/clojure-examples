(ns parallelmap.core
  (:gen-class))

(defn fetchFile [x]
  (slurp x))

(defn fetchFiles [xs]
  (map fetchFile xs))

(def files
  (pmap (fn [x] (str "files/data" x ".txt")) (range 1 10001)))

(defn -main
  "I don't do a whole lot ... yet."
  [& args]
  (println (fetchFiles files))
  (shutdown-agents))
