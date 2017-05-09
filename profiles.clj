{:user
 {:dependencies [;; Improves clojure.test output by diffing (is ...) exprs
                 [pjstadig/humane-test-output "0.8.1"]
                 ;; Provides functions for hot reloading dependencies
                 [alembic "0.3.2"]]
  :injections [(require 'pjstadig.humane-test-output)
               (pjstadig.humane-test-output/activate!)]
  :plugins [;; Emacs server-side CIDER nREPL integration
            [cider/cider-nrepl "0.14.0"]
            ;; Emacs clj-refactor integration
            [refactor-nrepl "2.2.0"]
            ;; Color printing from lein REPLs
            [lein-cprint "1.2.0"]
            ;; Clojure LINTer
            [jonase/eastwood "0.2.3"]
            ;; Another Clojure LINTer
            [lein-kibit "0.1.3"]
            ;; Look for outdated dependencies via `lein ancient`
            [lein-ancient "0.6.10"]
            ;; Autorerun tests via `lein test-refresh`
            [com.jakemccrary/lein-test-refresh "0.18.1"]
            ;; plugin for Leiningen which changes the REPL to pretty-print results with Puget
            [mvxcvi/whidbey "1.3.1"]
            ;; visualize project dependency structure via `lein topology`
            [lein-topology "0.2.0"]
            ;; tries to keep warm Java VMs ready to go for faster startup
            ;; [lein-drip "0.1.1-SNAPSHOT"]
            ;; Enables use of `lein exec path-to-clj-file` for shell scripting
            [lein-exec "0.3.6"]]
  :ring {:nrepl {:start? true :port 9999}}
  :test-refresh {:notify-command ["terminal-notifier" "-title" "Tests" "-message"]}}}
