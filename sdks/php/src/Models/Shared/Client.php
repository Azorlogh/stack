<?php

/**
 * Code generated by Speakeasy (https://speakeasyapi.dev). DO NOT EDIT.
 */

declare(strict_types=1);

namespace formance\stack\Models\Shared;


class Client
{
	#[\JMS\Serializer\Annotation\SerializedName('description')]
    #[\JMS\Serializer\Annotation\Type('string')]
    #[\JMS\Serializer\Annotation\SkipWhenEmpty]
    public ?string $description = null;
    
	#[\JMS\Serializer\Annotation\SerializedName('id')]
    #[\JMS\Serializer\Annotation\Type('string')]
    public string $id;
    
    /**
     * $metadata
     * 
     * @var ?array<string, mixed> $metadata
     */
	#[\JMS\Serializer\Annotation\SerializedName('metadata')]
    #[\JMS\Serializer\Annotation\Type('array<string, mixed>')]
    #[\JMS\Serializer\Annotation\SkipWhenEmpty]
    public ?array $metadata = null;
    
	#[\JMS\Serializer\Annotation\SerializedName('name')]
    #[\JMS\Serializer\Annotation\Type('string')]
    public string $name;
    
    /**
     * $postLogoutRedirectUris
     * 
     * @var ?array<string> $postLogoutRedirectUris
     */
	#[\JMS\Serializer\Annotation\SerializedName('postLogoutRedirectUris')]
    #[\JMS\Serializer\Annotation\Type('array<string>')]
    #[\JMS\Serializer\Annotation\SkipWhenEmpty]
    public ?array $postLogoutRedirectUris = null;
    
	#[\JMS\Serializer\Annotation\SerializedName('public')]
    #[\JMS\Serializer\Annotation\Type('bool')]
    #[\JMS\Serializer\Annotation\SkipWhenEmpty]
    public ?bool $public = null;
    
    /**
     * $redirectUris
     * 
     * @var ?array<string> $redirectUris
     */
	#[\JMS\Serializer\Annotation\SerializedName('redirectUris')]
    #[\JMS\Serializer\Annotation\Type('array<string>')]
    #[\JMS\Serializer\Annotation\SkipWhenEmpty]
    public ?array $redirectUris = null;
    
    /**
     * $scopes
     * 
     * @var ?array<string> $scopes
     */
	#[\JMS\Serializer\Annotation\SerializedName('scopes')]
    #[\JMS\Serializer\Annotation\Type('array<string>')]
    #[\JMS\Serializer\Annotation\SkipWhenEmpty]
    public ?array $scopes = null;
    
    /**
     * $secrets
     * 
     * @var ?array<\formance\stack\Models\Shared\ClientSecret> $secrets
     */
	#[\JMS\Serializer\Annotation\SerializedName('secrets')]
    #[\JMS\Serializer\Annotation\Type('array<formance\stack\Models\Shared\ClientSecret>')]
    #[\JMS\Serializer\Annotation\SkipWhenEmpty]
    public ?array $secrets = null;
    
	#[\JMS\Serializer\Annotation\SerializedName('trusted')]
    #[\JMS\Serializer\Annotation\Type('bool')]
    #[\JMS\Serializer\Annotation\SkipWhenEmpty]
    public ?bool $trusted = null;
    
	public function __construct()
	{
		$this->description = null;
		$this->id = "";
		$this->metadata = null;
		$this->name = "";
		$this->postLogoutRedirectUris = null;
		$this->public = null;
		$this->redirectUris = null;
		$this->scopes = null;
		$this->secrets = null;
		$this->trusted = null;
	}
}