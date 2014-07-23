import akka.actor.Props
import akka.actor.ActorSystem

import scala.collection.JavaConverters._

object Main {
	def main(args: Array[String]) : Unit = {
		val system = ActorSystem("twitter-stream")
		val actor = system.actorOf(Props[TwitterStreamActor], name = "twitter-stream-actor")
		val source: TwitterStreamSource = new TwitterStreamSource(actor)
		source.open()
	}
}
