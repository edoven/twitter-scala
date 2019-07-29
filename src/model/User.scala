package model

class User(user_handle: String, user_name: String) {

  def handle = user_handle
  def name = user_name
  var tweets = List[Tweet]()

  def addTweet(tweet: Tweet) : Unit = {
    this.tweets = tweet :: this.tweets
  }
}
