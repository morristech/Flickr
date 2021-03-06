package org.outofjungle.flickr.searcher;

import android.graphics.drawable.Drawable;

public class FlickrRecord {
	private String farm;
	private String id;
	private String owner;
	private String secret;
	private String server;
	private String title;
	private Drawable drawable;

	public FlickrRecord(String farm, String id, String owner, String secret,
			String server, String title) {
		this.farm = farm;
		this.id = id;
		this.owner = owner;
		this.secret = secret;
		this.server = server;
		this.title = title;
	}

	public String getId() {
		return id;
	}

	public String getTitle() {
		return title;
	}

	public String toString() {
		return ("farm: " + farm + "\n" + "id: " + id + "\n" + "owner: " + owner
				+ "\n" + "secret: " + secret + "\n" + "server: " + server
				+ "\n" + "title: " + title + "\n");
	}

	public String getThumbsUrl() {
		return "http://farm" + farm + ".static.flickr.com/" + server + "/" + id
				+ "_" + secret + "_s.jpg";
	}

	public String getImageUrl() {
		return "http://farm" + farm + ".static.flickr.com/" + server + "/" + id
				+ "_" + secret + ".jpg";
	}

	public void setDrawable(Drawable drawable) {
		this.drawable = drawable;
	}

	public Drawable getDrawable() {
		return drawable;
	}

}
