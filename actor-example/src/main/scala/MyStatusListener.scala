import twitter4j.Status
import twitter4j.StatusListener

import akka.actor.ActorRef

class MyStatusListener(actor: ActorRef) extends StatusListener {

	def onStatus(status: Status) = {
    	actor ! status
    }

	def onDeletionNotice(deletionNotice: twitter4j.StatusDeletionNotice) = {
		println("deletionNotice: " + deletionNotice)
	}

	def onScrubGeo(p1: Long, p2: Long) = {
		println("p1: " + p1 + ", p2: " + p2)
	}

	def onStallWarning(stallWarning: twitter4j.StallWarning) = {
		println("stallWarning: " + stallWarning)
	}

	def onTrackLimitationNotice(trackLimitationNotice: Int) {
		println("trackLimitationNotice: " + trackLimitationNotice)
	}

	def onException(exception: Exception) {
		println("exception: " + exception)
	}
}
