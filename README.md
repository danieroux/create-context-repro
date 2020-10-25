# This surprises me, what am I missing?

For this line in `core.cljs`:

`(def has-provider (some? (.-Provider (react/createContext "hmm"))))`

- When compiling without optimisations, `has-provider` is **true**

    `$ clj -m cljs.main -co build.edn -v -c -r`

- When compiling with advanced, `has-provider` is **false**

    `$ clj -m cljs.main -co build.edn -O advanced -v -c -s`