fun main() {
    print(cache.add("article-123", "https://coderbyte.com/article-123"))
    print(cache.add("article-456", "https://coderbyte.com/article-456"))
    print(cache.add("how-to-code-444", "https://coderbyte.com/how-to-code-444"))
    print(cache.get("first-article"))
    print(cache.get("second-article"))
    print(cache.get("article-456"))
    print(cache.add("article-123", "https://coderbyte.com/article-123"))
    print(cache.size())
}

class cache {
    companion object {
        var cacheList = HashMap<String, String>()

        fun get(str: String): String {
            return if (cacheList.containsKey(str)) {
                cacheList[str]!! + " "
            } else {
                "miss "
            }
        }

        fun add(key: String, value: String): String {
            return if (cacheList.containsKey(key)) {
                cacheList[key] = value
                "overwritten" + " "
            } else {
                cacheList[key] = value
                "added" + " "
            }
        }

        fun size(): String {
            return cacheList.size.toString() + " "
        }
    }
}