package org.apereo.cas.support.events.authentication;

import org.apereo.cas.authentication.Credential;
import org.apereo.cas.support.events.AbstractCasEvent;


/**
 * This is {@link CasAuthenticationTransactionSuccessfulEvent}.
 *
 * @author Misagh Moayyed
 * @since 5.0.0
 */
public class CasAuthenticationTransactionSuccessfulEvent extends AbstractCasEvent {
    private static final long serialVersionUID = 8059647975948452375L;

    private final Credential credential;


    /**
     * Instantiates a new Abstract cas sso event.
     *
     * @param source the source
     * @param c      the credential
     */
    public CasAuthenticationTransactionSuccessfulEvent(final Object source, final Credential c) {
        super(source);
        this.credential = c;
    }

    public Credential getCredential() {
        return credential;
    }
}
