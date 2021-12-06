# plugin-dns

### A plugin for the [ja-netfilter](https://github.com/pengzhile/ja-netfilter), it can block dns resolution.

#### Use the `mvn clean package` command to compile and use `dns-vX.X.X-jar-with-dependencies.jar` file!

## Config file

```
[DNS]
EQUAL,somedomain

# EQUAL     Use `equals` to compare
# KEYWORD   Use `contains` to compare
# PREFIX    Use `startsWith` to compare
# SUFFIX    Use `endsWith` to compare
# REGEXP    Use regular expressions to match
```
