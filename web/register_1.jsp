<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Strict//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-strict.dtd">
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsf/html" prefix="h" %>
<%@ taglib uri="http://java.sun.com/jsf/core" prefix="f" %>

<html>
    <head>
        <title>Facelet Title</title>
        <link href="application.css" rel="stylesheet" type="text/css"/>
    </head>
    <body>
        <f:view>

            <h3><h:outputText value="Cadastrar usuário:" styleClass="sectionName"/></h3>

            <h:form id="registerForm">

                <h:messages id="userMessages" showDetail="true" layout="table" styleClass="errorMessages"/>

                <h:panelGrid columns="2" styleClass="formPanel">

                    <h:outputLabel for="name">
                        <h:outputText value="Nome:"/>
                    </h:outputLabel>
                    <h:inputText id="name" value="#{userHandler.user.name}" required="true" 
                                 validatorMessage="Valor inválido." requiredMessage="O campo nome é obrigatório.">
                        <f:validateLength minimum="3" maximum="30"/>
                    </h:inputText>

                    <h:outputLabel for="birthDate">
                        <h:outputText value="Data de Nascimento: "/>
                    </h:outputLabel>
                    <h:inputText id="birthDate" required="true"
                                 value="#{userHandler.user.birthDate}" >
                        <f:convertDateTime type="date" dateStyle="short" pattern="dd/MM/yyyy"/> 
                    </h:inputText>

                    <h:outputLabel for="salary">
                        <h:outputText value="Salário: "/>
                    </h:outputLabel>
                    <h:inputText id="salary" required="true"
                                 value="#{userHandler.user.salary}" >
                        <f:convertNumber 
                            maxFractionDigits="2"
                            groupingUsed="true"
                            currencySymbol="$"
                            maxIntegerDigits="7"
                            type="currency"/>
                        <f:validateDoubleRange minimum="640" />
                    </h:inputText>	             

                    <h:commandButton id="register" styleClass="buttonAdd" 
                                     action="#{userHandler.addUser}" 
                                     value="Adicionar"
                                     />
                    <h:commandLink /> 
                </h:panelGrid>
            </h:form>
        </f:view>
    </body>
</html>
