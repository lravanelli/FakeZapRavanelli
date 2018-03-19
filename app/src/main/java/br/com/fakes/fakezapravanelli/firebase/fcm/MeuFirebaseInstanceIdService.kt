package br.com.fakes.fakezapravanelli.firebase.fcm

import com.google.firebase.iid.FirebaseInstanceIdService

class MeuFirebaseInstanceIdService : FirebaseInstanceIdService() {
    override fun onTokenRefresh() {
        super.onTokenRefresh()
        

    }
}