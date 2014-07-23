import twitter4j.TwitterStreamFactory;
import twitter4j.TwitterStream;
import twitter4j.FilterQuery;

import org.slf4j.LoggerFactory;
import org.slf4j.Logger;

import akka.actor.ActorRef;

public class TwitterStreamSource {
	private static final Logger LOG = LoggerFactory.getLogger(TwitterStreamSource.class);

	private static final String[] DEFAULT_TRACK_TERMS = {"movie", "star"};

	private final String[] _trackTerms;
	private final ActorRef _actor;

	public TwitterStreamSource(ActorRef actor) {
		this(DEFAULT_TRACK_TERMS, actor);
	}

	public TwitterStreamSource(String[] trackTerms, ActorRef actor) {
		_trackTerms = trackTerms;
		_actor = actor;
	}

	public void open() {
		TwitterStream twitterStream = new TwitterStreamFactory().getInstance();
		twitterStream.addListener(new MyStatusListener(_actor));
		FilterQuery filter = new FilterQuery();
		filter.count(0);
		filter.track(_trackTerms);
		twitterStream.filter(filter);
	}
}
