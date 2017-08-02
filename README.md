# Clojure Examples

These are some examples of doing things in Clojure. Hopefully these will serve as a learning process and an inspiration to do more Clojure!

## Installation of Leiningen

Leiningen is an amazing tool that simplifies various Clojure tasks. To install it on macOS:

```shell
brew install leiningen
```

Generally, to run the command line examples (from within each example directory):

```shell
lein run
```

If you want to experiment, there's always the REPL:

```shell
lein repl
```

If the REPL isn't good enough for you, you can create an app project:

```shell
lein new app myappname
```

Or you can create a library project:

```shell
lein new mylibname
```

## FAQs

### I've created a library. How do I load it in the REPL and test it?

After entering your project's directory and loading the REPL via `lein repl` you can load your library with the load function. If you had a Clojure source file under src named "core.clj", for example, you would load it in the following fashion:

```clojure
(load "mylibname/core")
```

You can then call a function (hello-world for example) declared inside the core.clj file:

```clojure
(mylibname.core/hello-world)
```
