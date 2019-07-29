import model.{User, Tweet}


object Run {



  def main(args: Array[String]): Unit = {
    def user1 = new User("edo","Data Scientist @ Twitter")

    def tweet_edo_01 = new Tweet("Hello twttr!")
    def tweet_edo_02 = new Tweet("This is getting interesting!")
    user1.addTweet(tweet_edo_01)
    user1.addTweet(tweet_edo_02)

    println(tweet_edo_01)
    println(user1.tweets.foreach(println))
    println(user1.tweets.length)
  }
}
