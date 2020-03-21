package keijumt.githubclient.auth.di

import dagger.Module
import keijumt.githubclient.auth.hostservice.HostServiceModule
import keijumt.githubclient.auth.infra.InfraModule
import keijumt.githubclient.auth.usecase.UseCaseModule

@Module(
    includes = [
        UseCaseModule::class,
        InfraModule::class,
        HostServiceModule::class
    ]
)
internal class AuthModule