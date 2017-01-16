// This file was generated by Mendix Modeler.
//
// WARNING: Code you write here will be lost the next time you deploy the project.

package administration.proxies;

public class Notification
{
	private final com.mendix.systemwideinterfaces.core.IMendixObject notificationMendixObject;

	private final com.mendix.systemwideinterfaces.core.IContext context;

	/**
	 * Internal name of this entity
	 */
	public static final java.lang.String entityName = "Administration.Notification";

	/**
	 * Enum describing members of this entity
	 */
	public enum MemberNames
	{
		Subject("Subject"),
		Content("Content"),
		Retrieved("Retrieved"),
		Notification_Account("Administration.Notification_Account");

		private java.lang.String metaName;

		MemberNames(java.lang.String s)
		{
			metaName = s;
		}

		@Override
		public java.lang.String toString()
		{
			return metaName;
		}
	}

	public Notification(com.mendix.systemwideinterfaces.core.IContext context)
	{
		this(context, com.mendix.core.Core.instantiate(context, "Administration.Notification"));
	}

	protected Notification(com.mendix.systemwideinterfaces.core.IContext context, com.mendix.systemwideinterfaces.core.IMendixObject notificationMendixObject)
	{
		if (notificationMendixObject == null)
			throw new java.lang.IllegalArgumentException("The given object cannot be null.");
		if (!com.mendix.core.Core.isSubClassOf("Administration.Notification", notificationMendixObject.getType()))
			throw new java.lang.IllegalArgumentException("The given object is not a Administration.Notification");

		this.notificationMendixObject = notificationMendixObject;
		this.context = context;
	}

	/**
	 * @deprecated Use 'Notification.load(IContext, IMendixIdentifier)' instead.
	 */
	@Deprecated
	public static administration.proxies.Notification initialize(com.mendix.systemwideinterfaces.core.IContext context, com.mendix.systemwideinterfaces.core.IMendixIdentifier mendixIdentifier) throws com.mendix.core.CoreException
	{
		return administration.proxies.Notification.load(context, mendixIdentifier);
	}

	/**
	 * Initialize a proxy using context (recommended). This context will be used for security checking when the get- and set-methods without context parameters are called.
	 * The get- and set-methods with context parameter should be used when for instance sudo access is necessary (IContext.getSudoContext() can be used to obtain sudo access).
	 */
	public static administration.proxies.Notification initialize(com.mendix.systemwideinterfaces.core.IContext context, com.mendix.systemwideinterfaces.core.IMendixObject mendixObject)
	{
		return new administration.proxies.Notification(context, mendixObject);
	}

	public static administration.proxies.Notification load(com.mendix.systemwideinterfaces.core.IContext context, com.mendix.systemwideinterfaces.core.IMendixIdentifier mendixIdentifier) throws com.mendix.core.CoreException
	{
		com.mendix.systemwideinterfaces.core.IMendixObject mendixObject = com.mendix.core.Core.retrieveId(context, mendixIdentifier);
		return administration.proxies.Notification.initialize(context, mendixObject);
	}

	public static java.util.List<administration.proxies.Notification> load(com.mendix.systemwideinterfaces.core.IContext context, java.lang.String xpathConstraint) throws com.mendix.core.CoreException
	{
		java.util.List<administration.proxies.Notification> result = new java.util.ArrayList<administration.proxies.Notification>();
		for (com.mendix.systemwideinterfaces.core.IMendixObject obj : com.mendix.core.Core.retrieveXPathQuery(context, "//Administration.Notification" + xpathConstraint))
			result.add(administration.proxies.Notification.initialize(context, obj));
		return result;
	}

	/**
	 * Commit the changes made on this proxy object.
	 */
	public final void commit() throws com.mendix.core.CoreException
	{
		com.mendix.core.Core.commit(context, getMendixObject());
	}

	/**
	 * Commit the changes made on this proxy object using the specified context.
	 */
	public final void commit(com.mendix.systemwideinterfaces.core.IContext context) throws com.mendix.core.CoreException
	{
		com.mendix.core.Core.commit(context, getMendixObject());
	}

	/**
	 * Delete the object.
	 */
	public final void delete()
	{
		com.mendix.core.Core.delete(context, getMendixObject());
	}

	/**
	 * Delete the object using the specified context.
	 */
	public final void delete(com.mendix.systemwideinterfaces.core.IContext context)
	{
		com.mendix.core.Core.delete(context, getMendixObject());
	}
	/**
	 * @return value of Subject
	 */
	public final String getSubject()
	{
		return getSubject(getContext());
	}

	/**
	 * @param context
	 * @return value of Subject
	 */
	public final String getSubject(com.mendix.systemwideinterfaces.core.IContext context)
	{
		return (String) getMendixObject().getValue(context, MemberNames.Subject.toString());
	}

	/**
	 * Set value of Subject
	 * @param subject
	 */
	public final void setSubject(String subject)
	{
		setSubject(getContext(), subject);
	}

	/**
	 * Set value of Subject
	 * @param context
	 * @param subject
	 */
	public final void setSubject(com.mendix.systemwideinterfaces.core.IContext context, String subject)
	{
		getMendixObject().setValue(context, MemberNames.Subject.toString(), subject);
	}

	/**
	 * @return value of Content
	 */
	public final String getContent()
	{
		return getContent(getContext());
	}

	/**
	 * @param context
	 * @return value of Content
	 */
	public final String getContent(com.mendix.systemwideinterfaces.core.IContext context)
	{
		return (String) getMendixObject().getValue(context, MemberNames.Content.toString());
	}

	/**
	 * Set value of Content
	 * @param content
	 */
	public final void setContent(String content)
	{
		setContent(getContext(), content);
	}

	/**
	 * Set value of Content
	 * @param context
	 * @param content
	 */
	public final void setContent(com.mendix.systemwideinterfaces.core.IContext context, String content)
	{
		getMendixObject().setValue(context, MemberNames.Content.toString(), content);
	}

	/**
	 * @return value of Retrieved
	 */
	public final java.util.Date getRetrieved()
	{
		return getRetrieved(getContext());
	}

	/**
	 * @param context
	 * @return value of Retrieved
	 */
	public final java.util.Date getRetrieved(com.mendix.systemwideinterfaces.core.IContext context)
	{
		return (java.util.Date) getMendixObject().getValue(context, MemberNames.Retrieved.toString());
	}

	/**
	 * Set value of Retrieved
	 * @param retrieved
	 */
	public final void setRetrieved(java.util.Date retrieved)
	{
		setRetrieved(getContext(), retrieved);
	}

	/**
	 * Set value of Retrieved
	 * @param context
	 * @param retrieved
	 */
	public final void setRetrieved(com.mendix.systemwideinterfaces.core.IContext context, java.util.Date retrieved)
	{
		getMendixObject().setValue(context, MemberNames.Retrieved.toString(), retrieved);
	}

	/**
	 * @return value of Notification_Account
	 */
	public final administration.proxies.Account getNotification_Account() throws com.mendix.core.CoreException
	{
		return getNotification_Account(getContext());
	}

	/**
	 * @param context
	 * @return value of Notification_Account
	 */
	public final administration.proxies.Account getNotification_Account(com.mendix.systemwideinterfaces.core.IContext context) throws com.mendix.core.CoreException
	{
		administration.proxies.Account result = null;
		com.mendix.systemwideinterfaces.core.IMendixIdentifier identifier = getMendixObject().getValue(context, MemberNames.Notification_Account.toString());
		if (identifier != null)
			result = administration.proxies.Account.load(context, identifier);
		return result;
	}

	/**
	 * Set value of Notification_Account
	 * @param notification_account
	 */
	public final void setNotification_Account(administration.proxies.Account notification_account)
	{
		setNotification_Account(getContext(), notification_account);
	}

	/**
	 * Set value of Notification_Account
	 * @param context
	 * @param notification_account
	 */
	public final void setNotification_Account(com.mendix.systemwideinterfaces.core.IContext context, administration.proxies.Account notification_account)
	{
		if (notification_account == null)
			getMendixObject().setValue(context, MemberNames.Notification_Account.toString(), null);
		else
			getMendixObject().setValue(context, MemberNames.Notification_Account.toString(), notification_account.getMendixObject().getId());
	}

	/**
	 * @return the IMendixObject instance of this proxy for use in the Core interface.
	 */
	public final com.mendix.systemwideinterfaces.core.IMendixObject getMendixObject()
	{
		return notificationMendixObject;
	}

	/**
	 * @return the IContext instance of this proxy, or null if no IContext instance was specified at initialization.
	 */
	public final com.mendix.systemwideinterfaces.core.IContext getContext()
	{
		return context;
	}

	@Override
	public boolean equals(Object obj)
	{
		if (obj == this)
			return true;

		if (obj != null && getClass().equals(obj.getClass()))
		{
			final administration.proxies.Notification that = (administration.proxies.Notification) obj;
			return getMendixObject().equals(that.getMendixObject());
		}
		return false;
	}

	@Override
	public int hashCode()
	{
		return getMendixObject().hashCode();
	}

	/**
	 * @return String name of this class
	 */
	public static java.lang.String getType()
	{
		return "Administration.Notification";
	}

	/**
	 * @return String GUID from this object, format: ID_0000000000
	 * @deprecated Use getMendixObject().getId().toLong() to get a unique identifier for this object.
	 */
	@Deprecated
	public java.lang.String getGUID()
	{
		return "ID_" + getMendixObject().getId().toLong();
	}
}