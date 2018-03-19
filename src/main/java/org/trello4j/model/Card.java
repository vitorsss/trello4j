package org.trello4j.model;

import java.util.Date;
import java.util.List;

public class Card extends TrelloObject {

	// TODO: idChecklists
	// TODO: checkItemStates

	private String name;
	private String desc;
	private boolean closed;
	private Long idShort;
	private String idList;
	private String idBoard;
	private List<String> idChecklists;
	private List<String> idMembers;
	private List<Attachment> attachments;
	private List<Label> labels;
	private String url;
	private double pos;
	private Date due;
	private boolean dueComplete;
	private Badges badges;

    public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getDesc() {
		return desc;
	}

	public void setDesc(String desc) {
		this.desc = desc;
	}

	public boolean isClosed() {
		return closed;
	}

	public void setClosed(boolean closed) {
		this.closed = closed;
	}

	public Long getIdShort() {
		return idShort;
	}

	public void setIdShort(Long idShort) {
		this.idShort = idShort;
	}

	public String getIdList() {
		return idList;
	}

	public void setIdList(String idList) {
		this.idList = idList;
	}

	public String getIdBoard() {
		return idBoard;
	}

	public void setIdBoard(String idBoard) {
		this.idBoard = idBoard;
	}

	public List<String> getIdMembers() {
		return idMembers;
	}

	public void setIdMembers(List<String> idMembers) {
		this.idMembers = idMembers;
	}

	public String getUrl() {
		return url;
	}

	public void setUrl(String url) {
		this.url = url;
	}

	public double getPos() {
		return pos;
	}

	public void setPos(double pos) {
		this.pos = pos;
	}

	public List<Attachment> getAttachments() {
		return attachments;
	}

	public void setAttachments(List<Attachment> attachments) {
		this.attachments = attachments;
	}

	public List<Label> getLabels() {
		return labels;
	}

	public void setLabels(List<Label> labels) {
		this.labels = labels;
	}
	
	public class Badges {
		private Long votes;
		private Long checkItems;
		private Long checkItemsChecked;
		private Long comments;
		private Long attachments;
		private Date due;
		private String fogbugz;
		private boolean viewingMemberVoted;
		private boolean subscribed;
		private boolean description;
		private boolean dueComplete;
		public Long getVotes() {
			return votes;
		}
		public void setVotes(Long votes) {
			this.votes = votes;
		}
		public Long getCheckItems() {
			return checkItems;
		}
		public void setCheckItems(Long checkItems) {
			this.checkItems = checkItems;
		}
		public Long getCheckItemsChecked() {
			return checkItemsChecked;
		}
		public void setCheckItemsChecked(Long checkItemsChecked) {
			this.checkItemsChecked = checkItemsChecked;
		}
		public Long getComments() {
			return comments;
		}
		public void setComments(Long comments) {
			this.comments = comments;
		}
		public Long getAttachments() {
			return attachments;
		}
		public void setAttachments(Long attachments) {
			this.attachments = attachments;
		}
		public Date getDue() {
			return due;
		}
		public void setDue(Date due) {
			this.due = due;
		}
		public String getFogbugz() {
			return fogbugz;
		}
		public void setFogbugz(String fogbugz) {
			this.fogbugz = fogbugz;
		}
		public boolean isViewingMemberVoted() {
			return viewingMemberVoted;
		}
		public void setViewingMemberVoted(boolean viewingMemberVoted) {
			this.viewingMemberVoted = viewingMemberVoted;
		}
		public boolean isSubscribed() {
			return subscribed;
		}
		public void setSubscribed(boolean subscribed) {
			this.subscribed = subscribed;
		}
		public boolean isDescription() {
			return description;
		}
		public void setDescription(boolean description) {
			this.description = description;
		}
		public boolean isDueComplete() {
			return dueComplete;
		}
		public void setDueComplete(boolean dueComplete) {
			this.dueComplete = dueComplete;
		}
		@Override
		public String toString() {
			return "Badges [votes=" + votes + ", checkItems=" + checkItems + ", checkItemsChecked=" + checkItemsChecked
					+ ", comments=" + comments + ", attachments=" + attachments + ", due=" + due + ", fogbugz="
					+ fogbugz + ", viewingMemberVoted=" + viewingMemberVoted + ", subscribed=" + subscribed
					+ ", description=" + description + ", dueComplete=" + dueComplete + "]";
		}
	}

	public class Attachment {

		private String _id;
		private String bytes;
		private Date date;
		private String url;
		private String name;
		private String idMember;

		public String get_id() {
			return _id;
		}

		public void set_id(String _id) {
			this._id = _id;
		}

		public String getBytes() {
			return bytes;
		}

		public void setBytes(String bytes) {
			this.bytes = bytes;
		}

		public Date getDate() {
			return date;
		}

		public void setDate(Date date) {
			this.date = date;
		}

		public String getUrl() {
			return url;
		}

		public void setUrl(String url) {
			this.url = url;
		}

		public String getName() {
			return name;
		}

		public void setName(String name) {
			this.name = name;
		}

		public String getIdMember() {
			return idMember;
		}

		public void setIdMember(String idMember) {
			this.idMember = idMember;
		}

		@Override
		public String toString() {
			return "Attachment [_id=" + _id + ", bytes=" + bytes + ", date=" + date + ", url=" + url + ", name=" + name
					+ ", idMember=" + idMember + "]";
		}
	}

	public Date getDue() {
		return due;
	}

	public void setDue(Date due) {
		this.due = due;
	}

	public boolean isDueComplete() {
		return dueComplete;
	}

	public void setDueComplete(boolean dueComplete) {
		this.dueComplete = dueComplete;
	}

	public List<String> getIdChecklists() {
		return idChecklists;
	}

	public void setIdChecklists(List<String> idChecklists) {
		this.idChecklists = idChecklists;
	}

	public Badges getBadges() {
		return badges;
	}

	public void setBadges(Badges badges) {
		this.badges = badges;
	}

	@Override
	public String toString() {
		return "Card [name=" + name + ", desc=" + desc + ", closed=" + closed + ", idShort=" + idShort + ", idList="
				+ idList + ", idBoard=" + idBoard + ", idChecklists=" + idChecklists + ", idMembers=" + idMembers
				+ ", attachments=" + attachments + ", labels=" + labels + ", url=" + url + ", pos=" + pos + ", due="
				+ due + ", dueComplete=" + dueComplete + ", badges=" + badges + ", id=" + id + "]";
	}
}
