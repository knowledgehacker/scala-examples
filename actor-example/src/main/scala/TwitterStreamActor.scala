import java.util.Date

import twitter4j.Status
import twitter4j.HashtagEntity
import twitter4j.UserMentionEntity

import akka.actor.Actor

class TwitterStreamActor extends Actor {

	/*
	override val supervisorStrategy = AllForOneStrategy() {
		case _: Exception =>
			println("Restarting...")
			Restart
	}
	*/

	def receive = {
		case status: Status =>
			val user: String = status.getUser().getScreenName()
			val name: String = status.getUser().getName()
			val location: String = status.getUser().getLocation()
			val date: Date = status.getCreatedAt()
			println("user: " + user + ", name: " + name + ", location: " + location + ", date: " + date)

			val text: String = status.getText()
			println("text: " + text)
			
			/*
			val hashTags: HashtagEntity[] = status.getHashtagEntities()
			*/
			val hashTags = status.getHashtagEntities()
			for(hashTag <- hashTags)
				println("hashTag: " + hashTag)
			val mentions = status.getUserMentionEntities();
			for(mention <- mentions)
				println("mention: " + mention)
			println("-----------------------------------------------------")

		case _ =>
			println("invalid message")
	}
}
