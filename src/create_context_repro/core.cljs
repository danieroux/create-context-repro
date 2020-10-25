(ns create-context-repro.core
  (:require
    [react]
    [react-dom]))

;;; This surprises me, what am I missing?
;;
;; When compiling without optimisations, `has-provider` is *true*
;; $ clj -m cljs.main -co build.edn -v -c -r
;;
;; When compiling with advanced, `has-provider` is *false*
;; $ clj -m cljs.main -co build.edn -O advanced -v -c -s
(def has-provider (some? (.-Provider (react/createContext "hmm"))))

(js/alert (str "Created context has provider: " has-provider))
